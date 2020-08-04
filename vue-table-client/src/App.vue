<template>
  <el-container>
    <!-- 头部区域 -->
    <el-header class="head">
      <h2>功能全面的表格</h2>
    </el-header>

    <!-- 主区域 -->
    <el-main>
      <data-table></data-table>
    </el-main>
  </el-container>
</template>

<script>
import DataTable from './components/DataTable'

export default {
  name: 'App',
  components: {
    DataTable
  }
}
</script>

<style>
  .head{
    background-color: #409EFF;
    color: white;
  }
</style>
