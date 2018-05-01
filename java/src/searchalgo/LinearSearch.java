package searchalgo;


       /* A simple approach is to do linear search, i.e
        Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
        If x matches with an element, return the index.
        If x doesn’t match with any of elements, return -1.  */

// Java code for linearly search x in arr[].  If x
// is present  then return its  location,  otherwise
// return -1
class LinearSearch
{
    // This function returns index of element x in arr[]
    static int search(int arr[], int n, int x)
    {
        for (int i = 0; i < n; i++)
        {
            // Return the index of the element if the element
            // is found
            if (arr[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }
}

//The time complexity of above algorithm is O(n).
