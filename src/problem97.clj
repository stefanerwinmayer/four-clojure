(ns problem97)

(def test-cases
  '[(= (__ 1) [1])
    (= (map __ (range 1 6))
       [[1]
        [1 1]
        [1 2 1]
        [1 3 3 1]
        [1 4 6 4 1]])
    (= (__ 11)
       [1 10 45 120 210 252 210 120 45 10 1])])

(def __
  (fn pascal
    [row]
    (if (= row 1)
      [1]
      (concat [1]
              (map #(apply + %)
                   (partition 2 1 (pascal (dec row))))
              [1])))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))