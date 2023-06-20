var isEmpty1 = function (obj) {
  for (const _ in obj) return false;
  return true;
};

function isEmpty2(obj) {
  if (Array.isArray(obj)) {
    return obj.length === 0;
  }

  if (typeof obj === 'object' && obj !== null) {
    return Object.keys(obj).length === 0;
  }

  return false;
}
