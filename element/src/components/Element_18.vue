<template>
  <div>
<!--    <el-rate v-model="value" @change="rateChange($event)"></el-rate>-->

    <el-rate
      v-model="value"
      :icon-classes="['icon-rate-face-1', 'icon-rate-face-2', 'icon-rate-face-3']"
      void-icon-class="icon-rate-face-off"
      :colors="['#99A9BF', '#F7BA2A', '#FF9900']">
    </el-rate>
  </div>
</template>

<script>
export default {
  data () {
    return {
      value: 2
    }
  },
  methods: {
    rateChange (data) {
    }
  }
}
</script>
