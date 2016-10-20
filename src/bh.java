import java.awt.Component;

abstract class bh {
	
	static short[][] a = new short[][] {{(short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) -22182, (short) -27211, (short) -27198, (short) -27186, (short) -27302, (short) 542, (short) 555, (short) 941, (short) 951, (short) 8076, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 11096, (short) 10258, (short) 10776, (short) 10661, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) -6630, (short) -5467, (short) -6473, (short) -6838, (short) -32318, (short) -26069, (short) -25925, (short) -25669, (short) 11202, (short) 22193, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) -25437, (short) -26445, (short) -27450, (short) 9694, (short) 21824, (short) 123, (short) 111, (short) 99, (short) 17814, (short) 16801, (short) 17837, (short) 16697, (short) 7341, (short) 7496, (short) 5330, (short) 7384, (short) 5268, (short) 3230, (short) 2223, (short) 72, (short) 10277, (short) 8377, (short) 8394, (short) 7384, (short) -22370, (short) -22221, (short) -22196, (short) -22314, (short) -29637, (short) -27434, (short) -29604, (short) -25491, (short) 662, (short) 796, (short) 933, (short) 819, (short) 10258, (short) 6430, (short) 5425, (short) 5314, (short) 10917, (short) 10925, (short) 10935, (short) 10471, (short) 10258, (short) 10524, (short) 10415, (short) 10301, (short) -11108, (short) -11093, (short) -11203, (short) -8034, (short) -5839, (short) -6836, (short) -5934, (short) -32674, (short) -14444, (short) -15455, (short) -15697, (short) -15557, (short) -15424, (short) -11622, (short) -11601, (short) -11450, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) -30054, (short) -30159, (short) -30019, (short) -21734, (short) -21845, (short) -21707, (short) -21690, (short) -21564, (short) -24921, (short) -24775, (short) -24640, (short) 662, (short) 794, (short) 811, (short) 945, (short) 827, (short) 957, (short) 5425, (short) 5314, (short) 11032, (short) 10921, (short) 11183, (short) 11069, (short) 11200, (short) 4775, (short) 3891, (short) 3904, (short) -18792, (short) -19799, (short) -20807, (short) -20677, (short) -20534, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 20366, (short) 21274, (short) 21415, (short) 20401, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 4300, (short) 8412, (short) 3294, (short) 4193, (short) 3303, (short) 123, (short) 111, (short) 99, (short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) 14990, (short) 14746, (short) 15779, (short) 15795, (short) 15944, (short) 662, (short) 796, (short) 941, (short) 951, (short) 148, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 10894, (short) 10776, (short) 10661, (short) 10795, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) 12998, (short) 12731, (short) 11718, (short) -6838, (short) -32318, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86}, {(short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) -22182, (short) -27211, (short) -27198, (short) -27186, (short) -27302, (short) 542, (short) 555, (short) 941, (short) 951, (short) 8076, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 11096, (short) 10258, (short) 10776, (short) 10661, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) -6630, (short) -5467, (short) -6473, (short) -6838, (short) -32318, (short) -26069, (short) -25925, (short) -25669, (short) 11202, (short) 22193, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) -25437, (short) -26445, (short) -27450, (short) 9694, (short) 21824, (short) 123, (short) 111, (short) 99, (short) 17814, (short) 16801, (short) 17837, (short) 16697, (short) 7341, (short) 7496, (short) 5330, (short) 7384, (short) 5268, (short) 3230, (short) 2223, (short) 72, (short) 10277, (short) 8377, (short) 8394, (short) 7384, (short) -22370, (short) -22221, (short) -22196, (short) -22314, (short) -29637, (short) -27434, (short) -29604, (short) -25491, (short) 662, (short) 796, (short) 933, (short) 819, (short) 10258, (short) 6430, (short) 5425, (short) 5314, (short) 10917, (short) 10925, (short) 10935, (short) 10471, (short) 10258, (short) 10524, (short) 10415, (short) 10301, (short) -11108, (short) -11093, (short) -11203, (short) -8034, (short) -5839, (short) -6836, (short) -5934, (short) -32674, (short) -14444, (short) -15455, (short) -15697, (short) -15557, (short) -15424, (short) -11622, (short) -11601, (short) -11450, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) -30054, (short) -30159, (short) -30019, (short) -21734, (short) -21845, (short) -21707, (short) -21690, (short) -21564, (short) -24921, (short) -24775, (short) -24640, (short) 662, (short) 794, (short) 811, (short) 945, (short) 827, (short) 957, (short) 5425, (short) 5314, (short) 11032, (short) 10921, (short) 11183, (short) 11069, (short) 11200, (short) 4775, (short) 3891, (short) 3904, (short) -18792, (short) -19799, (short) -20807, (short) -20677, (short) -20534, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 20366, (short) 21274, (short) 21415, (short) 20401, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 4300, (short) 8412, (short) 3294, (short) 4193, (short) 3303, (short) 123, (short) 111, (short) 99, (short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) 14990, (short) 14746, (short) 15779, (short) 15795, (short) 15944, (short) 662, (short) 796, (short) 941, (short) 951, (short) 148, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 10894, (short) 10776, (short) 10661, (short) 10795, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) 12998, (short) 12731, (short) 11718, (short) -6838, (short) -32318, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86}, {(short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) -22182, (short) -27211, (short) -27198, (short) -27186, (short) -27302, (short) 542, (short) 555, (short) 941, (short) 951, (short) 8076, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 11096, (short) 10258, (short) 10776, (short) 10661, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) -6630, (short) -5467, (short) -6473, (short) -6838, (short) -32318, (short) -26069, (short) -25925, (short) -25669, (short) 11202, (short) 22193, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) -25437, (short) -26445, (short) -27450, (short) 9694, (short) 21824, (short) 123, (short) 111, (short) 99, (short) 17814, (short) 16801, (short) 17837, (short) 16697, (short) 7341, (short) 7496, (short) 5330, (short) 7384, (short) 5268, (short) 3230, (short) 2223, (short) 72, (short) 10277, (short) 8377, (short) 8394, (short) 7384, (short) -22370, (short) -22221, (short) -22196, (short) -22314, (short) -29637, (short) -27434, (short) -29604, (short) -25491, (short) 662, (short) 796, (short) 933, (short) 819, (short) 10258, (short) 6430, (short) 5425, (short) 5314, (short) 10917, (short) 10925, (short) 10935, (short) 10471, (short) 10258, (short) 10524, (short) 10415, (short) 10301, (short) -11108, (short) -11093, (short) -11203, (short) -8034, (short) -5839, (short) -6836, (short) -5934, (short) -32674, (short) -14444, (short) -15455, (short) -15697, (short) -15557, (short) -15424, (short) -11622, (short) -11601, (short) -11450, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) -30054, (short) -30159, (short) -30019, (short) -21734, (short) -21845, (short) -21707, (short) -21690, (short) -21564, (short) -24921, (short) -24775, (short) -24640, (short) 662, (short) 794, (short) 811, (short) 945, (short) 827, (short) 957, (short) 5425, (short) 5314, (short) 11032, (short) 10921, (short) 11183, (short) 11069, (short) 11200, (short) 4775, (short) 3891, (short) 3904, (short) -18792, (short) -19799, (short) -20807, (short) -20677, (short) -20534, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 20366, (short) 21274, (short) 21415, (short) 20401, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 4300, (short) 8412, (short) 3294, (short) 4193, (short) 3303, (short) 123, (short) 111, (short) 99, (short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) 14990, (short) 14746, (short) 15779, (short) 15795, (short) 15944, (short) 662, (short) 796, (short) 941, (short) 951, (short) 148, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 10894, (short) 10776, (short) 10661, (short) 10795, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) 12998, (short) 12731, (short) 11718, (short) -6838, (short) -32318, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86}, {(short) 4300, (short) 3294, (short) 3303, (short) 3264, (short) 4506, (short) 4382, (short) 4387, (short) 5293, (short) 7622, (short) 7384, (short) 8412, (short) 7496, (short) 86, (short) 123, (short) 111, (short) 99, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) -25437, (short) -26445, (short) -27450, (short) 9694, (short) 21824, (short) 123, (short) 111, (short) 99, (short) 17814, (short) 16801, (short) 17837, (short) 16697, (short) 7341, (short) 7496, (short) 5330, (short) 7384, (short) 5268, (short) 3230, (short) 2223, (short) 72, (short) 10277, (short) 8377, (short) 8394, (short) 7384, (short) -22370, (short) -22221, (short) -22196, (short) -22314, (short) -29637, (short) -27434, (short) -29604, (short) -25491, (short) 662, (short) 796, (short) 933, (short) 819, (short) 10258, (short) 6430, (short) 5425, (short) 5314, (short) 10917, (short) 10925, (short) 10935, (short) 10471, (short) 10258, (short) 10524, (short) 10415, (short) 10301, (short) -11108, (short) -11093, (short) -11203, (short) -8034, (short) -5839, (short) -6836, (short) -5934, (short) -32674, (short) -14444, (short) -15455, (short) -15697, (short) -15557, (short) -15424, (short) -11622, (short) -11601, (short) -11450, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) -30054, (short) -30159, (short) -30019, (short) -21734, (short) -21845, (short) -21707, (short) -21690, (short) -21564, (short) -24921, (short) -24775, (short) -24640, (short) 662, (short) 794, (short) 811, (short) 945, (short) 827, (short) 957, (short) 5425, (short) 5314, (short) 11032, (short) 10921, (short) 11183, (short) 11069, (short) 11200, (short) 4775, (short) 3891, (short) 3904, (short) -18792, (short) -19799, (short) -20807, (short) -20677, (short) -20534, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 20366, (short) 21274, (short) 21415, (short) 20401, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 4300, (short) 8412, (short) 3294, (short) 4193, (short) 3303, (short) 123, (short) 111, (short) 99, (short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) 14990, (short) 14746, (short) 15779, (short) 15795, (short) 15944, (short) 662, (short) 796, (short) 941, (short) 951, (short) 148, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 10894, (short) 10776, (short) 10661, (short) 10795, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) 12998, (short) 12731, (short) 11718, (short) -6838, (short) -32318, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86}, {(short) 18322, (short) 17304, (short) 16289, (short) 15929, (short) 6569, (short) 7613, (short) 7630, (short) 6364, (short) 7054, (short) 7079, (short) 5056, (short) 6988, (short) 8481, (short) 7475, (short) 7364, (short) 8412, (short) -21990, (short) -21969, (short) -21952, (short) -22182, (short) -27211, (short) -27198, (short) -27186, (short) -27302, (short) 542, (short) 555, (short) 941, (short) 951, (short) 8076, (short) 6936, (short) 5675, (short) 5440, (short) 10014, (short) 11179, (short) 11197, (short) 11096, (short) 10258, (short) 10776, (short) 10661, (short) 10419, (short) -10984, (short) -11095, (short) -11072, (short) -6630, (short) -5467, (short) -6473, (short) -6838, (short) -32318, (short) -26069, (short) -25925, (short) -25669, (short) 11202, (short) 22193, (short) 123, (short) 111, (short) 99, (short) 4, (short) 12, (short) 24, (short) 37, (short) 49, (short) 61, (short) 74, (short) 86, (short) 22461, (short) -21571, (short) 11200, (short) 957, (short) -10317, (short) 5056, (short) -31808, (short) 123, (short) 22453, (short) -21579, (short) 11191, (short) 949, (short) -10325, (short) 4023, (short) -31817, (short) 4, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 20366, (short) 20401, (short) 662, (short) 827, (short) 7054, (short) 5056, (short) -21734, (short) -21564, (short) -14444, (short) -15424, (short) 11032, (short) 11200, (short) 4, (short) 123, (short) 61, (short) -18792, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 4300, (short) 3294, (short) 3303, (short) 3264, (short) 4506, (short) 4382, (short) 4387, (short) 5293, (short) 8412, (short) 8301, (short) 8076, (short) 6936, (short) 5675, (short) 941, (short) 5056, (short) 15795, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0}};
	static int b;
	static int c = 0;
	static int d;
	static int e;
	static ob f = rf.a(40, "<col=ffff00>");
	static ob g = rf.a(40, "au");
	static int h;
	static int i;
	static int j;
	static int k;
	static int l;
	
	abstract void a(Component component, int var2);
	
	static void a(int unused) {
		try {
			c = 0;
			++h;
			int i = ic.entityXPosition + (le.T.coordX >> 7);
			int i1 = ic.entityYPosition + (le.T.coordY >> 7);
			if (~i <= -3054 && i <= 3156 && i1 >= 3056 && ~i1 >= -3137) {
				c = 1;
			}
			
			if (i >= 3072 && ~i >= -3119 && i1 >= 9492 && ~i1 >= -9536) {
				c = 1;
			}
			
			if (c == 1 && i >= 3139 && ~i >= -3200 && i1 >= 3008 && i1 <= 3062) {
				c = 0;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "bh.J(" + unused + ')');
		}
	}
	
	abstract void a(Component component, byte var2);
	
	@SuppressWarnings("SynchronizeOnNonFinalField")
	static void b(int unused) {
		try {
			if (vc.g != null) {
				synchronized (vc.g) {
					vc.g = null;
				}
			}
			
			++b;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "bh.E(" + unused + ')');
		}
	}
	
	static void c(int var0) {
		int dummy = client.anInt_wb;
		
		try {
			if (var0 == 37) {
				++i;
				gf var1 = (gf) vg.X.a((byte) -9);
				if (dummy != 0 || var1 != null) {
					do {
						label31:
						{
							if (~var1.K == 0) {
								var1.q = 0;
								sh.a(var0 + -29, var1);
								if (dummy == 0) {
									break label31;
								}
							}
							
							var1.c(128);
						}
						
						var1 = (gf) vg.X.b((byte) 117);
					} while (var1 != null);
					
				}
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "bh.D(" + var0 + ')');
		}
	}
	
	static g d(int unused) {
		try {
			++d;
			if (hb.t == null) {
				hb.t = new g();
			}
			
			return hb.t;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "bh.A(" + unused + ')');
		}
	}
	
	static void a(int i, int unused, int i1, int i2, int i3) {
		int dummy = client.anInt_wb;
		
		try {
			qf class_qf = (qf) va.h.a((byte) -9);
			if (/*dummy == 0 && */class_qf == null) {
				++j;
			} else {
				do {
					if (class_qf.r != -1 || class_qf.o != null) {
						int i4;
						i4 = 0;
						if (~class_qf.B > ~i2) {
							i4 += i2 + -class_qf.B;
						}
						
						if (class_qf.C > i2) {
							i4 += class_qf.C + -i2;
						}
						
						if (~i < ~class_qf.p) {
							i4 += i + -class_qf.p;
						}
						
						if (i < class_qf.K) {
							i4 += class_qf.K - i;
						}
						
						if (~class_qf.z <= ~(i4 + -64) && qf.L != 0 && ~i1 == ~class_qf.q) {
							i4 -= 64;
							if (i4 < 0) {
								i4 = 0;
							}
						} else {
							if (class_qf.t != null) {
								ub.d.a(class_qf.t);
								class_qf.t = null;
							}
							
							if (class_qf.A != null) {
								ub.d.a(class_qf.A);
								class_qf.A = null;
								i4 -= 64;
								if (i4 < 0) {
									i4 = 0;
								}
							}
						}
						
						int i5;
						i5 = (class_qf.z - i4) * qf.L / class_qf.z;
						if (class_qf.t != null) {
							class_qf.t.h(i5);
						}
						
						if (~class_qf.r <= -1) {
							eg class_eg = eg.a(hi.cacheFile_4, class_qf.r, 0);
							if (class_eg != null) {
								oa oa = class_eg.a().a(qi.o);
								td class_td = td.a(oa, 100, i5);
								if (class_td != null) {
									class_td.g(-1);
								}
								ub.d.b(class_td);
								class_qf.t = class_td;
							}
						}
						
						if (class_qf.A == null) {
							if (class_qf.o != null && (class_qf.F -= i3) <= 0) {
								int i6 = (int) (Math.random() * (double) class_qf.o.length);
								eg class_eg = eg.a(hi.cacheFile_4, class_qf.o[i6], 0);
								if (class_eg != null) {
									oa oa = class_eg.a().a(qi.o);
									td class_td = td.a(oa, 100, i5);
									if (class_td != null) {
										class_td.g(0);
									}
									ub.d.b(class_td);
									class_qf.F = (int) ((double) (class_qf.w - class_qf.D) * Math.random()) + class_qf.D;
									class_qf.A = class_td;
								}
							}
						} else {
							class_qf.A.h(i5);
							if (!class_qf.A.a(-1677781832)) {
								class_qf.A = null;
							}
						}
					}
					
					class_qf = (qf) va.h.b((byte) 101);
				} while (class_qf != null);
				
				++j;
			}
		} catch (RuntimeException var13) {
			throw bc.a(var13, "bh.I(" + i + ',' + unused + ',' + i1 + ',' + i2 + ',' + i3 + ')');
		}
	}
	
	public static void a(byte unused) {
		try {
			f = null;
			a = null;
			g = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "bh.B(" + unused + ')');
		}
	}
	
	abstract int e(int var1);
	
	static byte[] a(byte[] bytes, int unused) {
		try {
			++e;
			int length = bytes.length;
			byte[] bytes1 = new byte[length];
			p.arrayCopy(bytes, 0, bytes1, 0, length);
			return bytes1;
		} catch (RuntimeException var4) {
			throw bc.a(var4, "bh.F(" + "{...}" + ',' + unused + ')');
		}
	}
}
