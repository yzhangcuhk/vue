<template>
  <el-container>
    <!-- 顶栏 -->
    <el-header height="60px">
      <h2>Element 页面布局</h2>
    </el-header>

    <!-- 嵌套容器 -->
    <el-container>
      <!-- 侧边导航菜单 -->
      <el-aside width="150px"></el-aside>
      <!-- 内容 -->
      <el-main>
        <!-- 第一列栅格布局 -->
        <el-row>
          <el-col :span="12" class="col1"></el-col>
          <el-col :span="12" class="col2"></el-col>
        </el-row>
        <!-- 第二列布局 -->
        <el-row>
          <el-col :span="24" class="col3"></el-col>
        </el-row>
      </el-main>
    </el-container>

    <!-- 底栏 -->
    <el-footer height="30px">&copy;慎之不独 2020</el-footer>
  </el-container>
</template>

<style>
  .el-header {
    background-color: #409EFF;
    color: white;
  }
  .el-aside {
    background-color: chartreuse;
  }
  .el-main {
    background-color: darkkhaki;
  }
  .el-col {
    height: 200px;
  }
  .col1 {
    background-color: teal;
  }
  .col2 {
    background-color: tomato;
  }
  .col3 {
    background-color: thistle;
  }
  .el-footer {
    background-color: #909399;
    color: black;
    text-align: center;
  }
</style>
