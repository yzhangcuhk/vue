<template>
  <el-form ref="form" :model="form" label-width="80px">
    <el-form-item label="活动名称">
      <el-input v-model="form.name"></el-input>
    </el-form-item>
    <el-form-item label="活动区域">
      <el-select v-model="form.region" placeholder="请选择活动区域">
        <el-option label="区域一" value="shanghai"></el-option>
        <el-option label="区域二" value="beijing"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="活动时间">
      <el-col :span="11">
        <el-date-picker type="date" placeholder="选择日期" v-model="form.date1" style="width: 100%;"></el-date-picker>
      </el-col>
      <el-col class="line" :span="2">-</el-col>
      <el-col :span="11">
        <el-time-picker type="fixed-time" placeholder="选择时间" v-model="form.date2" style="width: 100%;"></el-time-picker>
      </el-col>
    </el-form-item>
    <el-form-item label="即时配送">
      <el-switch v-model="form.delivery"></el-switch>
    </el-form-item>
    <el-form-item label="活动性质">
      <el-checkbox-group v-model="form.type">
        <el-checkbox label="1" name="type">美食/餐厅线上活动</el-checkbox>
        <el-checkbox label="2" name="type">地推活动</el-checkbox>
        <el-checkbox label="3" name="type">线下主题活动</el-checkbox>
        <el-checkbox label="4" name="type">单纯品牌曝光</el-checkbox>
      </el-checkbox-group>
    </el-form-item>
    <el-form-item label="特殊资源">
      <el-radio-group v-model="form.resource" @change="change2">
        <el-radio label="1">线上品牌商赞助</el-radio>
        <el-radio label="2">线下场地免费</el-radio>
      </el-radio-group>
    </el-form-item>
    <el-form-item label="活动形式">
      <el-input type="textarea" v-model="form.desc"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="onSubmit">立即创建</el-button>
      <el-button>取消</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  data () {
    return {
      form: {
        name: '我是活动名称',
        region: 'shanghai',
        date1: new Date().toDateString(),
        date2: new Date().toTimeString(),
        delivery: true,
        type: ['1', '2'],
        resource: '1',
        desc: '我是活动形式描述'
      }
    }
  },
  methods: {
    change2 (data) {
    },
    onSubmit () {
      alert('onSubmit')
    }
  }
}
</script>
