import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Board from '../views/Board.vue'
import Card from '../views/Card.vue'

Vue.use(VueRouter)

const routes = [ // router configuration array - associates paths to components
  {
    path: '/',  // this is the path
    name: 'Home', // name for path may be used in a router link tag
    component: Home //  component in the view folder to use when path is referenced
  },
  {
    path: '/board/:id', // path with path variable
    name: 'Board',
    component: Board
  },
  {
    path: '/board/:boardID/card/:cardID',
    name: 'Card',
    component: Card
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
