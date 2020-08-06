<template>
  <div>
    <el-input
      placeholder="请选择日期"
      suffix-icon="el-icon-date"
      v-model="input2">
    </el-input>
    <el-input
      placeholder="请输入内容"
      prefix-icon="el-icon-search"
      v-model="input21">
    </el-input>

    <el-input
      placeholder="请选择日期"
      v-model="input22">
      <i slot="suffix" class="el-input__icon el-icon-date"></i>
    </el-input>
    <el-input
      placeholder="请输入内容"
      v-model="input23">
      <i slot="prefix" class="el-input__icon el-icon-search"></i>
    </el-input>

    <div>
      <el-input placeholder="请输入内容" v-model="input3">
        <template slot="prepend">Http://</template>
      </el-input>
    </div>
    <div>
      <el-input placeholder="请输入内容" v-model="input4">
        <template slot="append">.com</template>
      </el-input>
    </div>
    <div>
      <el-input placeholder="请输入内容" v-model="input5" class="input-with-select">
        <el-select v-model="select" slot="prepend" placeholder="请选择">
          <el-option label="餐厅名" value="1"></el-option>
          <el-option label="订单号" value="2"></el-option>
          <el-option label="用户电话" value="3"></el-option>
        </el-select>
        <el-button slot="append" icon="el-icon-search"></el-button>
      </el-input>
    </div>

    <el-autocomplete
      class="inline-input"
      v-model="state1"
      :fetch-suggestions="querySearch"
      placeholder="请输入内容"
      @select="handleSelect"
    ></el-autocomplete>

    <el-autocomplete
      popper-class="my-autocomplete"
      v-model="state2"
      :fetch-suggestions="querySearch"
      placeholder="请输入内容"
      @select="handleSelect">
      <i
        class="el-icon-edit el-input__icon"
        slot="suffix"
        @click="handleIconClick">
      </i>
      <template slot-scope="props">
        <div class="name">{{ props.item.value }}</div>
        <span class="addr">{{ props.item.address }}</span>
      </template>
    </el-autocomplete>
  </div>
</template>
