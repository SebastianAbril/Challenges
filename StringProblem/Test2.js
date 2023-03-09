/**
 * Having a string of random characters and random length, 
 * create a method that identifies how many substrings of 4 
 * characters appear more than once along the main string. 
 * The method’s only argument should be the main string.
 */

 const substringCounter = (string) =>{
    /**
     * correct value validation 
     */
    if(typeof(string) !== "string") return "It is not a valid entry"
    let subStrings = []; // save the substrings
    const rep = {}; // save how many times each substrigs appears
    let repsCounter = 0; // count the strings that appear more than once
  
    /**
     * slice every 4 characters and push them to an array
     */
    for(let i = 0; i < string.length-3; i++){
      subStrings.push(string.substr(i, 4));
    }
    /**
     * compares each 
     */
    subStrings.forEach(e =>  (rep[e] = rep[e] + 1 || 1));
    for(const element in rep){
      if(rep[element] >1 ){
        repsCounter++;
      }
    }
    return `There are ${repsCounter} substrings that appear more than once along the main string`;
  }
  
  let test1 = "abcdefgabcdefgabcde"
  let test2 = 12123
  let test3 = "abcdabcdabcdabcd"
  let test4 = "sadfabcdwertycvbnabcdirytdfgdabcd"
  let test5 = "abdcdefgdabcdefgadbcde"
  console.log(substringCounter(test1));