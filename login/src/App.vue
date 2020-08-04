<template>
  <el-container>
    <el-header class="header">
      <h3>管理台</h3>
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
  .header {
    background-color: #409EFF;
    color: white;
  }
</style>
