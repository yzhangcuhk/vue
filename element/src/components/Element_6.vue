<template>
  <div>
    <el-radio-group v-model="radio1" @change="change">
      <el-radio :label="3">备选项</el-radio>
      <el-radio :label="6">备选项</el-radio>
      <el-radio :label="9">备选项</el-radio>
    </el-radio-group>

    <br/>

    <el-radio-group v-model="radio2" @change="change2">
      <el-radio-button label="上海"></el-radio-button>
      <el-radio-button label="北京"></el-radio-button>
      <el-radio-button label="广州"></el-radio-button>
      <el-radio-button label="深圳"></el-radio-button>
    </el-radio-group>
  </div>
</template>

<script>
export default {
  data () {
    return {
      radio1: 3,
      radio2: '上海'
    }
  },
  methods: {
    change (data) {
      alert(data)
    },
    change2 (data) {
      alert(data)
    }
  }
}
</script>
