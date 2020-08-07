<template>
  <el-container>
    <el-header>
      <h3>系统用户列表</h3>
    </el-header>
    <el-main>
      <el-table border>
        <el-table-column label="姓名" prop="name" align="center"></el-table-column>
        <el-table-column label="登录名" prop="loginName" align="center"></el-table-column>
        <el-table-column label="状态" prop="status" align="center"></el-table-column>
        <el-table-column label="注册时间" prop="gmtCreate" align="center"></el-table-column>
      </el-table>
    </el-main>
  </el-container>
</template>
