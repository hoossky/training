<template>
    <button @click="addCounter">{{ counter }}</button>
</template>

<script>
    export default {
        name:  'globalComponent',
        props: ['initialCounter'],
        template: '<button @click="addCounter"> {{ counter }}</button>',
        data: function () {
            return{
                counter: this.initialCounter
            }
        },
        methods: {
            addCounter: function () {
                this.counter += 1
            }
        }
    }
</script>