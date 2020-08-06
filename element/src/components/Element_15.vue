<template>
  <el-date-picker @change="dateChange($event)" @focus="dateFocus($event)"
    v-model="value1"
    type="date"
    placeholder="选择日期">
  </el-date-picker>
</template>

<script>
export default {
  data () {
    return {
      value1: new Date().toDateString()
    }
  },
  methods: {
    dateChange (data) {
      console.log('dateChange' + data)
    },
    dateFocus (data) {
      console.log('dateChange' + data)
    }
  }
}
</script>
