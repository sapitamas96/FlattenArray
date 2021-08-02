# REST endpoints
---
## Flatten Array

Accepts an object array with arbitrary depth in json format and returns a flattend version of the array.

**HTTP Request example:**

```
	GET https://8.8.8.8:8080/api/convert/array/flatten
```

**Parameters**

| Name | Data Type |
|------|-----------|
| array | Object[] |

**Example request**

```json
	{
		 "array" : [1, 2, [3, [4, 5], 6], 7, [[8], 9, 10, 11], [[[[[[[12]]]]]]]]
	}
```
**Example response**
```json
	{
		 "array" : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
	}
```
