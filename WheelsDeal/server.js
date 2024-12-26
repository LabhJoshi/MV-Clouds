const exp = require('express');
const cors = require('cors');
const app = exp();
const path = require('path');
const bodyParser = require('body-parser');
const { Pool } = require('pg');

const pool = new Pool({
    user: 'postgres',
    host: 'localhost',
    database: 'WheelsDeal',
    password: 'Labh@160',
    port: 5432,
});

app.use(exp.static(path.join(__dirname)));
app.use(bodyParser.json());
app.use(cors());

app.get('/api/trending_cars', async (req, res) => {
    try {
        const result = await pool.query('SELECT * FROM trending_cars');
        res.json(result.rows);
    } catch (err) {
        console.error(err);
        res.status(500).send('Server error');
    }
});

app.get('/api/popular_cars', async (req, res) => {
    try {
        const result = await pool.query('SELECT * FROM popular_cars');
        res.json(result.rows);
    } catch (err) {
        console.error(err);
        res.status(500).send('Server error');
    }
});

app.get('/api/upcoming_cars', async (req, res) => {
    try {
        const result = await pool.query('SELECT * FROM upcoming_cars');
        res.json(result.rows);
    } catch (err) {
        console.error(err);
        res.status(500).send('Server error');
    }
});

app.post('/api/signup', async (req, res) => {
    var count=1002;
    const { email, username, password } = req.body;
    try {
        const result = await pool.query('INSERT INTO Users (user_id, email, username, password) VALUES ($1, $2, $3, $4)', [count, email, username, password]);
        res.status(200).json(result.rows[0]);
    } catch (err) {
        console.error(err);
        res.status(500).send('Server error');
    }
    count++;
});

app.get('/api/login', async (req, res)=>{
    try{
        const result = await pool.query('SELECT * FROM Users');
        res.json(result.rows);
        console.log(result.rows);
    } catch (err) {
        console.error(err);
        res.status(500).send('Server error');
    }
});

app.post('/api/contact', async (req, res) => {
    var count=101;
    const { first_name, last_name, email, phone, comment } = req.body;

    try {
        var query = 'INSERT INTO contact (contact_id, first_name, last_name, email, phone, comment) VALUES ($1, $2, $3, $4, $5, $6)';
        const result = await pool.query(query, [count, first_name, last_name, email, phone, comment]);
        res.status(200).json(result.rows[0]);
    } catch (err) {
        console.error(err);
        res.status(500).send('Server error');
    }
    count++;
});

app.post('/api/sell', async (req, res) => {
    var count=1001;
    const { name, number, email, car_name, price, fuel, transmission, year, image } = req.body;

    try {
        var query = 'INSERT INTO sell (sell_id, name, number, email, car_name, sell_price, fuel_type, transmission_type, mfg_year, image_url) VALUES ($1, $2, $3, $4, $5, $6, $7, $8, $9, $10)';
        const result = await pool.query(query, [count, name, number, email, car_name, price, fuel, transmission, year, image]);
        res.status(200).json(result.rows[0]);
    } catch (err) {
        console.error(err);
        res.status(500).send('Server error');
    }
    count++;
});

app.get('/api/search', async (req, res) => {
    var carname=req.query.name;
    try {
        const result = await pool.query('SELECT * FROM cars WHERE car_name like $1', [`%${carname}%`]);
        res.json(result.rows);
    } catch (err) {
        console.error(err);
        res.status(500).send('Server error');
    }
});

app.get('/api/car_details', async (req, res) => {
    var car_id=req.query.car_id;
    // console.log(car_id);
    try{
        const result = await pool.query('SELECT * FROM cars WHERE car_id=$1', [car_id]);
        res.json(result.rows);
    } catch (err) {
        console.error(err);
        res.status(500).send('Server error');
    }
});

const PORT = 5000;
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
