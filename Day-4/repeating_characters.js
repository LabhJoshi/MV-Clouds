const fs=require('fs');

var content=fs.readFileSync('local_text.txt').toString().split(', ');

function findFirstRepeatingCharacter(word) {
    let charMap = {};
    for (let i = 0; i < word.length; i++) {
        let char = word[i];
        if (charMap[char] !== undefined) {
            return { [char]: [charMap[char], i] };
        }
        charMap[char] = i;
    }
    return null;
}

let result = content.map(word => findFirstRepeatingCharacter(word)).filter(obj => obj !== null);

console.log(result);