function sevenBoom(arr) {
    var new_arr= arr.join('');
    if(new_arr.includes(7)){
        return "Boom!";
    }else{
        return "there is no 7 in the array";
    }
}
//I don't remember how to Javascript I need HALP. I'm trying to console log the function and put an array to see if it'll either boom
//or not.


console.log(sevenBoom(["1", "2", "3"]));
