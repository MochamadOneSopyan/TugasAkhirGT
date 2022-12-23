<template>
  <div>
    <FormRegisterVue></FormRegisterVue>
    <CopyrightVue></CopyrightVue>
  </div>
</template>

<script>
import FormRegisterVue from "@/components/FormRegister.vue";
import CopyrightVue from "@/components/Copyright.vue";
export default {
  name: "registerPage",
  components: {
    FormRegisterVue,
    CopyrightVue,
  },
};
</script>

<style></style>
