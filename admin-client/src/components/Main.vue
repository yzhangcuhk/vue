<template>
  <el-container>
    <el-container>
      <el-aside>
          <el-menu
            class="el-menu-vertical-demo"
            @open="handleOpen"
            @close="handleClose"
            @select="handleSelect"
            background-color="#545c64"
            text-color="#fff"
            active-text-color="#ffd04b"
          >

            <el-submenu index="userManage">
              <template slot="title">
                <i class="el-icon-menu"></i>
                <span>用户管理</span>
              </template>
              <el-menu-item index="sysUser">
                <span>系统用户</span>
              </el-menu-item>
              <el-menu-item index="user">
                <span>C端用户</span>
              </el-menu-item>
            </el-submenu>

            <el-submenu index="2">
              <template slot="title">
                <i class="el-icon-menu"></i>
                <span>导航二</span>
              </template>
              <el-menu-item index="21">
                <span>菜单21</span>
              </el-menu-item>
              <el-menu-item index="22">
                <span>菜单22</span>
              </el-menu-item>
            </el-submenu>

            <el-submenu index="3">
              <template slot="title">
                <i class="el-icon-menu"></i>
                <span>导航三</span>
              </template>
              <el-menu-item index="31">
                <span>菜单31</span>
              </el-menu-item>
              <el-menu-item index="32">
                <span>菜单32</span>
              </el-menu-item>
            </el-submenu>

            <el-submenu index="4">
              <template slot="title">
                <i class="el-icon-menu"></i>
                <span>导航四</span>
              </template>
              <el-menu-item index="41">
                <span>菜单31</span>
              </el-menu-item>
              <el-menu-item index="42">
                <span>菜单32</span>
              </el-menu-item>
            </el-submenu>

            <el-submenu index="5">
              <template slot="title">
                <i class="el-icon-menu"></i>
                <span>导航五</span>
              </template>
              <el-menu-item index="51">
                <span>菜单51</span>
              </el-menu-item>
              <el-menu-item index="52">
                <span>菜单52</span>
              </el-menu-item>
            </el-submenu>
          </el-menu>
      </el-aside>

      <router-view></router-view>
    </el-container>
    <el-footer>&copy;慎之不独 2020</el-footer>
  </el-container>
</template>

<script>
export default {
  data () {
    return {
      data: {
        breadcrumbItems: ['系统用户']
      }
    }
  },
  methods: {
    handleOpen (key, keyPath) {
      // console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      // console.log(key, keyPath)
    },
    handleSelect (key, keyPath) {
      console.log(key, keyPath)
      switch (key) {
        case 'sysUser':
          this.$router.push('/sysUser')
          this.breadcrumbItems = ['系统用户']
          break
        case 'user':
          this.$router.push('/user')
          this.breadcrumbItems = ['C端用户']
          break
        default:
          console.log('nothing')
      }
    }
  }
}
</script>

<style>
  .el-aside {
    height: 100%;
  }
  .el-footer {
    background-color: #909399;
    color: black;
    text-align: center;
  }
</style>
