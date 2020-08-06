<template>
  <el-color-picker v-model="color" @change="activeChange($event)"></el-color-picker>
</template>

<script>
export default {
  data () {
    return {
      color: '#2AFF00'
    }
  },
  methods: {
    activeChange (data) {
      alert(data)
    }
  }
}
</script>
