export function objectsDeeplyEqual(cmp1, cmp2) {
    if (typeof cmp1 !== typeof cmp2) {
      return false;
    }
  
    if (cmp1 === cmp2) {
      return true;
    }

    if (Array.isArray(cmp1) && Array.isArray(cmp2)) {
      if (cmp1.length !== cmp2.length) {
        return false;
      }
      for (let i = 0; i < cmp1.length; i++) {
        if (!objectsDeeplyEqual(cmp1[i], cmp2[i])) {
          return false;
        }
      }
      return true;
    } 
  
    else if (typeof cmp1 === 'object' && cmp1 !== null && typeof cmp2 === 'object' && cmp2 !== null) {
      const keys1 = Object.keys(cmp1);
      const keys2 = Object.keys(cmp2);
  
      if (keys1.length !== keys2.length) {
        return false;
      }
  
      for (let key of keys1) {
        if (!keys2.includes(key)) {
          return false;
        }
        if (!objectsDeeplyEqual(cmp1[key], cmp2[key])) {
          return false;
        }
      }
      return true;
    }

    return false;
  }
  