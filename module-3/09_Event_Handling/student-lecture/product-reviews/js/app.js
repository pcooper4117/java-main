const name = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  pageTitle.querySelector('.name').innerText = name;
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

/**
 * I will display all of the reviews in the reviews array
 */
function displayReviews() {
  // use the template already defined in the html to add product reviews
  if ('content' in document.createElement('template')) { // if the html contains a template 
                                                        // make a copy of it
    reviews.forEach((review) => {
      displayReview(review);
    });
  } else { // if no template dont display
    console.error('Your browser does not support templates');
  }
}

/**
 *
 * @param {Object} review The review to display
 */
function displayReview(review) {// add a product review to the dom using the predefined template
  const main = document.getElementById('main');
  const tmpl = document.getElementById('review-template').content.cloneNode(true);
  // set the values of copied template
  tmpl.querySelector('h4').innerText = review.reviewer;
  tmpl.querySelector('h3').innerText = review.title;
  tmpl.querySelector('p').innerText = review.review;
  // there will always be 1 star because it is a part of the template
  for (let i = 1; i < review.rating; ++i) { // loop any additional star img
    const img = tmpl.querySelector('img').cloneNode(); // make a copy of img
    tmpl.querySelector('.rating').appendChild(img); // add to dive containing the stars
  }
  main.appendChild(tmpl); // add new product review div to dom
}

// LECTURE STARTS HERE ---------------------------------------------------------------
// wait until the dom is fully created because events will not be added if not
document.addEventListener('DOMContentLoaded', () => {
// set the product reviews page title
setPageTitle();
// set the product reviews page description
setPageDescription();
// display all of the product reviews on our page
displayReviews();
// any additional event listeners will be added here for same reason
const theDescription = document.querySelector('.description')
theDescription.addEventListener('click', (event) => {
                                                  toggleDescriptionEdit(event.target)
})
// when user presses enter we want to save the text 
// when the user presses esc we dont save
//
const theTextBox = document.getElementById('inputDesc') // get a reference to the text box
theTextBox.addEventListener('keyup',(event) => {
                                        if(event.key === 'Enter') {
                                                                  exitDescriptionEdit(event.target, true)
 }
                                        if (event.key === 'Escape'){
                                                                  exitDescriptionEdit(event.target, false)
 }
})
// when the user click add review button display the form to get the review data
 const theAddReviewButton = document.getElementById('btnToggleForm');
 theAddReviewButton.addEventListener('click', () =>{                   //Listen for Click on show review
   showHideForm()                                                     // call showHideForm
 })
 const theSaveReviewButton = document.getElementById('btnSaveReview');
 theSaveReviewButton.addEventListener('click', ()=>{
   event.preventDefault()
   saveReview()
 })
})
/**
 * Run when a click event on the description  and swap out the description for a text box.
 *
 * @param {Event} event the event object
 * 
 * Swap the description on the page with a text box so the user can enter a new description
 */
function toggleDescriptionEdit(desc) { // receive the element that was clicked as an argument
  const textBox = desc.nextElementSibling; // get a reference to the next sibling of the element that was clicked
                                          // get a reference to the input that follows the p which were passed
  textBox.value = description;    // initalize the text box to the description
  textBox.classList.remove('d-none'); // allow the textbox to display by removing the d-none class
  desc.classList.add('d-none'); // hide the element that was clicked by adding the d-none class
  textBox.focus();   // put the curser to the text box
}

/**
 * Take an event on the text box and set the description to the contents
 * of the text box and then hide the text box and show the description.
 *
 * @param {Event} event the event object
 * @param {Boolean} save should we save the description text
 */
function exitDescriptionEdit(textBox, save) {  // 
  let desc = textBox.previousElementSibling;
  if (save) {
    desc.innerText = textBox.value;
  }
  textBox.classList.add('d-none');
  desc.classList.remove('d-none');
}

/**
 * I will show / hide the add review form
 */
function showHideForm() {
  const form = document.querySelector('form');
  const btn = document.getElementById('btnToggleForm');

  if (form.classList.contains('d-none')) {  // if form is hidden
    form.classList.remove('d-none');      // display it 
    btn.innerText = 'Hide Form';          // change the button to say hide form
    document.getElementById('name').focus();    // put cursor in the name field on the form
  } else {                                          // if form is displayed reset form values
    resetFormValues();
    form.classList.add('d-none');                   // hide form
    btn.innerText = 'Add Review';                           // change button to say add review
  }
}

/**
 * I will reset all of the values in the form.
 */
function resetFormValues() {                      
  const form = document.querySelector('form');                   //get reference to form
  const inputs = form.querySelectorAll('input');          // get an array of references to all inputs
  inputs.forEach((input) => {                                 // loop through elements
    input.value = '';                                   //set value to ' '
  });
  document.getElementById('rating').value = 1;                  // reset rating to one
  document.getElementById('review').value = '';                 // reset review to ' '
}

/**
 * I will save the review that was added using the add review from
 */
function saveReview() {
  //get info from user
  // get a reference
  const theName = document.getElementById('name')
  const theTitle = document.getElementById('title')
  const theReview = document.getElementById('review')
  const theRating = document.getElementById('rating')

  // save to array
  // creat new object for the new array
  const newReview = {
    reviewer: theName.value, 
    title: theTitle.value, 
    review: theReview.value, 
    rating: theRating.value, 
  }
  // add the new object to the array
  reviews.push(newReview)
  displayReview(newReview)
}
