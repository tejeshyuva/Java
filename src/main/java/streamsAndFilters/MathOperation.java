package streamsAndFilters;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
    MathOperation addition = Integer::sum;
}

















