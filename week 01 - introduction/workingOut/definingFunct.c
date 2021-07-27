#include <stdlib.h>
#include <stdio.h>

int foo(int a) {
	int answer = 0; // 0 is false
	if(a % 2 == 0) {
		answer = 1;
		return answer;
	}else {
		return answer;
	}
}

int main() {
	int input = 0;
	scanf("%d", &input);
	int result = foo(input);
	printf("%d\n", result);

	return 0;
}
