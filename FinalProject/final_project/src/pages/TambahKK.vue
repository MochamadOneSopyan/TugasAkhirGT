<template>
  <div class="">
    <SideBarVue></SideBarVue>
    <FormTambahKKVue></FormTambahKKVue>
    <!-- <SuccessFormVue></SuccessFormVue> -->
  </div>
</template>

<script>
import SideBarVue from "@/components/SideBar.vue";
import FormTambahKKVue from "@/components/FormTambahKK.vue";
// import SuccessFormVue from "@/components/SuccessForm.vue";
export default {
  name: "tambahKK",
  components: {
    SideBarVue,
    FormTambahKKVue,
    // SuccessFormVue,
  },
};
</script>

<style></style>
