import Vue from 'vue'
import Router from 'vue-router'
import Main from '@/components/Main'
import Login from '@/components/Login'
import User from '@/components/User'
import SysUser from '@/components/SysUser'
import Index from '@/components/Index'

Vue.use(Router)

const originalPush = Router.prototype.push
Router.prototype.push = function push (location) {
  return originalPush.call(this, location).catch(err => err)
}

export default new Router({
  routes: [
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/',
      component: Main,
      children: [
        {
          path: '/',
          name: 'Main',
          component: Index
        },
        {
          path: '/index',
          name: 'Index',
          component: Index
        },
        {
          path: '/user',
          name: 'User',
          component: User
        },
        {
          path: '/sysUser',
          name: 'SysUser',
          component: SysUser
        }
      ]
    }
  ]
})
