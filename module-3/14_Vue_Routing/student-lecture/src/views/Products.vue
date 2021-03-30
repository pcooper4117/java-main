<!-- router veiw for displaying the list of product on our main page -->
<template>
    <div class ='products'>
        <h1>Products</h1>
        <products-list />
    </div>
</template>
<script>
import ProductsList from '@/components/ProductsList'
export default {
 components: {
     ProductsList
 }
      
}
</script>

<style scoped>

</style>