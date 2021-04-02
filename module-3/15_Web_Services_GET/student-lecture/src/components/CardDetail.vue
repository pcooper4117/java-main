<template>
  <div></div>
</template>

<script>
import boardsService from '../services/BoardService'
export default {
  name: "card-detail",
 data(){
   return{ cards:[] // this is gonna hold the data displayed in this page
 }
 },
 created() {
   //call the getCards() in board service to get data
   boardsService.getCards(this.$route.params.boardID).then(response) => {
      this.cards.response.data.cards
   }
 }
};
</script>
