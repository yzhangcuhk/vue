<template>
  <el-progress :percentage="percentage"></el-progress>
</template>

<script>
export default {
  data () {
    return {
      timer: '',
      percentage: 90
    }
  },
  methods: {
    increase () {
      if (this.percentage >= 99) {
        clearInterval(this.timer)
      } else {
        return this.percentage++
      }
    }
  },
  mounted () {
    this.timer = setInterval(this.increase, 1000)
  },
  beforeDestroy () {
    clearInterval(this.timer)
  }
}
</script>
