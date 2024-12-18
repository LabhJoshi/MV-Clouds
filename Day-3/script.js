// a=97 and z=122, A=65 and Z=90

var str="The LitTle MErMaid";
var next='';

var output=str.split('').sort((a,b)=>{
    return a.charCodeAt(0)-b.charCodeAt(0);
}).join('');

console.log(output)