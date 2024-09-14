package main

import (
	"fmt"
	"sort"

)

func main() {
	fmt.Println("Enter a number: ")
	arr := make([]int, 3)

	for i := 0; i < 3; i++ {
		fmt.Scan(&arr[i])
	}
	sort.Ints(arr)

	fmt.Println("The medain of this data is: ", arr[1])

}