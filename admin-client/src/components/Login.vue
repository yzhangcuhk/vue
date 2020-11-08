<template>
  <el-card class="box-card">
    <el-form ref="loginForm" :model="user" :rules="rules" status-icon label-width="80px">
      <el-form-item label="账号" prop="loginName">
        <el-input v-model="user.loginName"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input v-model="user.password" type="password"></el-input>
      </el-form-item>

      <el-button class="login" type="primary" @click="login">登录</el-button>
    </el-form>
  </el-card>
</template>

<script>
export default {
  data () {
    return {
      user: {
      },
      rules: {
        loginName: [
          {required: true, message: '账号不能为空', trigger: 'blur'}
        ],
        password: [
          {required: true, message: '密码不能为空', trigger: 'blur'}
        ]
      }
    }
  },
  methods: {
    login () {
      this.$refs.loginForm.validate(valid => {
        if (valid) {
          alert('userName: ' + this.user.loginName + ', password: ' + this.user.password)
          window.open(this.clientUrl + 'index', '_self')
        } else {
          return false
        }
      })
    }
  }
}
</script>

<style>
  .box-card {
    width: 480px;
    text-align: center;
    display: block;
    margin: 150px auto;
  }
  body{
    /*background-image: url("../img/6.png");*/
  }
</style>
