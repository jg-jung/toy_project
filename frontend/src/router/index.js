import { createRouter, createWebHistory } from 'vue-router'
import LOGIN from '../components/views/Login.vue'

const routes = [
  {
    path: '/login',
    name: 'LOGIN',
    component: LOGIN
  },
  {
    path: '/join',
    name: 'JOIN',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../components/views/Join.vue')
  }                                                    
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
