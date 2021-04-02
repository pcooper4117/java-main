//axios is a framework for  making api calls from javascript
// being a framework we have to understand how it is intended to be used


import axios from 'axios'; // give me access to axios code

const http = axios.create({   // instaniate an axios object
  baseURL: "http://localhost:3000" // reference the server
});

export default { // expose functions/data to outside process
// call the server defined for the axios object with an http get
//    and the path specified
// axios makes the request to the server asyncronosly
  getBoards() { // starts the api request and returns a promise
    return http.get('/boards');
  },

  getCards(boardID) {
    return http.get(`/boards/${boardID}`)// tick marks indicate interpolationn
  },

  getCard(boardID, cardID) {
    return http.get(`/boards/${boardID}`).then((response) => {
      const cards = response.data.cards;
      return cards.find(card => card.id == cardID);
    })
  }

}
