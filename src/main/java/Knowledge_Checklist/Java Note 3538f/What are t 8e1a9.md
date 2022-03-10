# What are the differences between HashMap, LinkedHashMap and TreeMap?

The HashMap and LinkedHashMap classes implement the Map interface, whereas TreeMap implements the Map , and SortedMap interface.
****`HashMap` offers **O(1)** lookup and insertion. It is implemented by an array of linked lists.
`LinkedHashMap` offers **O(1)** lookup and insertion. Keys are ordered by their insertion order. It is implemented by doubly-linked buckets. non-synchronize, have one null key and multiple null values.
`TreeMap` offers **O(log N)** lookup and insertion. Keys are ordered, so if you need to iterate through the keys in sorted order, you can. This means that keys must implement the Comparable interface. TreeMap is implemented by a Red-Black Tree.