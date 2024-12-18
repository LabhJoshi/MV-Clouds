var n='47 20 93 13 45'

// console.log(n.replaceAll(' ',''))
// console.log(typeof Number('3'))
n=n.replaceAll(' ',',');
// console.log(n)
var numbers=[]
for(i=0;i<n.length;i++){
    if(n[i]===','){
        continue
    }
    numbers.push(Number(n[i]));
}
console.log(numbers)
// console.log(numbers.sort((a,b)=>{return a-b}));

