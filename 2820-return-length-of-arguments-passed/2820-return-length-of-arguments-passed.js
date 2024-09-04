/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    let ans=0;
    for(let i=0;i<args.length;i++){
        ans++;
    }
    return ans;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */