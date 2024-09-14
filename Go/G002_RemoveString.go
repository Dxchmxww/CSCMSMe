package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	// read str1 ang ignore the error by using the blank identifier "_"
	str1, _ := reader.ReadString('\n')
	str2, _ := reader.ReadString('\n')

	// remove white space form lead and tail of the string
	str1 = strings.TrimSpace(str1)
	str2 = strings.TrimSpace(str2)

	var longer, shorter string
	if len(str1) > len(str2) {
		longer = str1
		shorter = str2
	} else {
		longer = str2
		shorter = str1
	}

	// Remove all occurrences of the shorter string from the longer string
	result := strings.ReplaceAll(longer, shorter, "")

	// Output the modified longer string
	fmt.Println(result)
}
