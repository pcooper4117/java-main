// add pageTitle
const pageTitle = 'My Shopping List';
// add groceries
const groceries = ['Meat', 'Beer', 'Veggies', 'Eggs', 'Bread', 'Water', 'Milk', 'T.P.', 'Fruit', 'Gatorade'];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
const title = document.querySelector('#title');
title.innerText = pageTitle;
}
/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
// use for each 
function displayGroceries() {
const list = document.querySelector('#groceries')
  for (let i=0; i < groceries.length; i++) {
  const listItem = document.createElement('li');
  listItem.innerText = groceries[i];
  list.appendChild(listItem)
}
}
/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
const listItem = document.querySelectorAll('.shopping-list ul li')  // reference 
// loop each item 
listItem.forEach(element => {      
  element.classList.add('completed');  // add completed w classlist
});
}
setPageTitle();
displayGroceries();
// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button

  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});