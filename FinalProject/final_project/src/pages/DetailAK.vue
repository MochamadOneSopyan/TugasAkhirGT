<template>
  <div class="">
    <SideBarVue></SideBarVue>
    <div class="container">
      <TableDataAKVue></TableDataAKVue>
    </div>
  </div>
</template>

<script>
import SideBarVue from "@/components/SideBar.vue";
import TableDataAKVue from "@/components/TableDataAK.vue";
export default {
  name: "detailAK",
  components: {
    SideBarVue,
    TableDataAKVue,
  },
};
</script>

<style scoped>
.container {
  margin-left: 300px;
}
</style>
