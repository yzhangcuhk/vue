<template>
  <div>
    <el-transfer v-model="value" :data="data" :props="{key: 'id',label: 'name'}"></el-transfer>

    <el-transfer
      v-model="value"
      filterable
      :left-default-checked="[2, 3]"
      :right-default-checked="[1]"
      :render-content="renderFunc"
      :titles="['Source', 'Target']"
      :button-texts="['到左边', '到右边']"
      :props="{key: 'id',label: 'name'}"
      :format="{
      noChecked: '${total}',
      hasChecked: '${checked}/${total}'
    }"
      @change="handleChange"
      :data="data">
      <el-button class="transfer-footer" slot="left-footer" size="small">操作</el-button>
      <el-button class="transfer-footer" slot="right-footer" size="small">操作</el-button>
    </el-transfer>
  </div>
</template>

<script>
export default {
  data () {
    return {
      value: [1, 2, 3],
      data: [{id: 1, name: '测试1'}, {id: 2, name: '测试2'}, {id: 3, name: '测试3'}],
      total: [],
      checked: []
    }
  },
  methods: {
    renderFunc () {
    },
    handleChange (value, direction, movedKeys) {
      console.log(value, direction, movedKeys)
      if (direction === 'right') {
      }
      if (direction === 'left') {
      }
    }
  }
}
</script>
