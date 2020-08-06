<template>
  <el-row>
    <el-col :span="6" class="title">
      <b><i class="el-icon-eleme" /> Element图标应用</b>
    </el-col>
    <el-col :span="6">
      <el-link icon="el-icon-s-home" type="primary">主页</el-link>&nbsp;
      <el-link>
        <i class="el-icon-user-solid"></i> 个人设置
      </el-link>
    </el-col>
    <el-col :span="6">
      <el-input suffix-icon="el-icon-search" size="mini"/>
    </el-col>
    <el-col :span="5" :offset="1">
      <el-button icon="el-icon-upload" type="primary" size="mini">登录</el-button>
      <el-button size="mini">
        <i class="el-icon-edit"></i> 注册
      </el-button>
    </el-col>
  </el-row>
</template>

<script>
export default {
}
</script>

<style>
  .title {
    color: #409EFF
  }
</style>
