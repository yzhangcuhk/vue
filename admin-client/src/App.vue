<template>
  <el-container>
    <el-header class="app">
      <h3>麻雀管理台</h3>
    </el-header>
    <el-main>
      <router-view></router-view>
    </el-main>
  </el-container>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
  .app {
    background-color: #409EFF;
    color: white;
  }
</style>
