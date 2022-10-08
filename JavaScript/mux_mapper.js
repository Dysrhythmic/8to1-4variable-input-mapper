// a program for mapping the input line values for a 8:1 multiplexer when implementing a 4 variable min function
// the last digit of the binary equivalent of the minterms, the digit in the 1's place, will be referred to as d

// the minterms array represents the minterms that make the function being implemented by the MUX = 1
const minterms = [0, 4, 5, 8, 9, 12, 13, 14, 15];

const sortMinterms = minterms => {
  // dF represents the intersection of minterms from the set that make the function being implemented by the MUX = 1 and
  // the set where d = 1
  const dF = [];

  // dF represents the intersection of minterms from the set that make the function being implemented by the MUX = 1 and
  // the set where d = 0
  const dComplementF = [];

  minterms.forEach(term => term % 2 == 0 ? dComplementF.push(term) : dF.push(term));

  return [dF, dComplementF]
}

const mapInputLineValues = (minterms, n) => {
  const [ dF, dComplementF ] = sortMinterms(minterms);

  if (0 <= n && n <= 7) {
    // This will be the case when the function will be false no matter the value of input d.
    if (!dComplementF.includes(2 * n) && !dF.includes(2 * n + 1)) return 0;

    // This will be the case when the function will be true no matter the value of input d.
    else if (dComplementF.includes(2 * n) && dF.includes(2 * n + 1)) return 1;

    // This will be the case when the functions value will be the same as the value of input d.
    else if (!dComplementF.includes(2 * n) && dF.includes(2 * n + 1)) return 'd';

    // This will be the case when the functions value will be the opposite of the value of input d.
    else if (dComplementF.includes(2 * n) && !dF.includes(2 * n + 1)) return 'd\'';
  }
  else console.log(`invalid input line value: ${n}`);
};

for (n = 0; n < 8; n++) {
  console.log(`${n}: ${mapInputLineValues(minterms, n)}`);
}
