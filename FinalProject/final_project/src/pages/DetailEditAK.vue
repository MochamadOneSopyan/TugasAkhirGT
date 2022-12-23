<template>
  <div class="">
    <SideBarVue></SideBarVue>
    <div class="container">
      <FormDetailAKVue></FormDetailAKVue>
    </div>
  </div>
</template>

<script>
import SideBarVue from "@/components/SideBar.vue";
import FormDetailAKVue from "@/components/FormDetailAK.vue";
export default {
  name: "detailAK",
  components: {
    SideBarVue,
    FormDetailAKVue,
  },
};
</script>

<style scoped>
.container {
  margin-left: 300px;
}
</style>
