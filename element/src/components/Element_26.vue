<template>
  <div>
    <el-pagination
      layout="prev, pager, next"
      :total="50">
    </el-pagination>
    <el-pagination
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="currentPage"
      :page-sizes="[100, 200, 300, 400]"
      :page-size="100"
      layout="total, sizes, prev, pager, next, jumper"
      :total="400">
    </el-pagination>
  </div>
</template>

<script>
export default {
  data () {
    return {
      currentPage: 2
    }
  },
  methods: {
    handleSizeChange () {
    },
    handleCurrentChange () {
    }
  }
}
</script>
