<template>
  <el-container>
    <el-header>
      <h3>用户列表</h3>
    </el-header>
    <el-main>
      <el-table border>
        <el-table-column label="姓名" prop="name" align="center"></el-table-column>
        <el-table-column label="手机号" prop="mobile" align="center"></el-table-column>
        <el-table-column label="邮箱" prop="email" align="center"></el-table-column>
        <el-table-column label="年龄" prop="age" align="center"></el-table-column>
        <el-table-column label="住址" prop="address" align="center"></el-table-column>
        <el-table-column label="状态" prop="status" align="center"></el-table-column>
        <el-table-column label="注册时间" prop="gmtCreate" align="center"></el-table-column>
      </el-table>
    </el-main>
  </el-container>
</template>
