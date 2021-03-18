/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function multiplyTogether(num1, num2){
  let result = num1 * num2;
  return result;
}
/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */
function multiplyNoUndefined(firstParameter=0, secondParameter=0){


return firstParameter * secondParameter;
}
 
/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter == 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}

function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}

/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 * .reduce() goes through the array one element at a time passing the element to the function
 * thats used as the argument
 * syntax: arrayName.reduce(anonymous-function(reducer, element-in-array))
 * the anonymous function takes two parameters: reducer and element
 *      the reducer will hold th value to the previous call to the anon func
 *      (result from prior execution)
 *      
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  // the variable sum (reducer) will contain the sum of all the numbers in the array
 // the variable aNumber will be the current element in the array passed to the anonFunc
 
  return numbersToSum.reduce((sum, aNumber) =>{
                                               return sum += aNumber;

                                               });
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 * 
 *  .filter() when you want to select elements from an array
 * .filter will return an array of elements that a call back func said should be in the array
 * .filter will go through the array one element at  time passing the element to callback
 * the callback func tells filter to place the current element in the new array
 * 
 * syntax: arrayName.filter(callback-func(anElement))
 *              returns true if the element should be returned
 * 
 */
function allDivisibleByThree(numbersToFilter) {
  //return an array of only the numbers divisible by three 

return numbersToFilter.filter((anElement)=> {
if(anElement % 3 ===0){
  return true;
}
else{
  return false;
}
})
// function allDivisibleByThree(numbersToFilter){
// return numbersToFilter.filter(isDivisibleByThreee(anElement))
//}
}


/**
 * This example was added by Frank at the last minute and has no test.
 * Give the browser the html and use the inspect to to run it
 * 
 * The map function will return an array created from the elements passed to it
 * by returning true- if the callback func returns false it does not add element
 * 
 * 
 * 
 * @param - None
 * @returns {array created from values passed to it}
 */

function mapArrayFunctionExampleFromBook(numbersToSquare = [1, 2, 3, 4]
  ) {
  //create a new array containing the mathematical square of all the values in another array
  //use map to create a new array whose elements are result of processing elements in another array
  //
  //
  // call the map func for each element in the array to have elements in array squared
  // . map () returns a new array with the elements form the array its passed


console.log(`Array calling map to create new array with values squared: `)
console.table(numbersToSquare);

let squaredNumbers = numbersToSquare.map( (number) => {
    return number * number;
});

console.log(`Array returned from map with values in passed array squared: `)
console.table(squaredNumbers);
}
function forEachExample(anArray=["Jason", "D", "Avery", "Jeff"]){
  anArray.forEach((anElement)=>{
    console.log(anElement)
  })
}