<template>
  <el-switch @change="switchStatus($event)"
    v-model="switchValue"
    active-color="#13ce66"
    inactive-color="#ff4949">
  </el-switch>
</template>

<script>
export default {
  data () {
    return {
      switchValue: true
    }
  },
  methods: {
    switchStatus (data) {
      alert(data)
    }
  }
}
</script>
