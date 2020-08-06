<template>
  <div>
    <el-time-select
      v-model="value"
      :picker-options="{
    start: '08:30',
    step: '00:15',
    end: '18:30'
  }"
      placeholder="选择时间">
    </el-time-select>

    <el-time-picker
      v-model="value"
      :picker-options="{
      selectableRange: '18:30:00 - 20:30:00'
    }"
      placeholder="任意时间点">
    </el-time-picker>

    <el-time-picker
      is-range
      v-model="value"
      range-separator="至"
      start-placeholder="开始时间"
      end-placeholder="结束时间"
      placeholder="选择时间范围">
    </el-time-picker>
  </div>
</template>
