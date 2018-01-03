function Calculator(leftOperand, operator, rightOperand) {
    this.leftOperand = leftOperand;
    this.operator = operator;
    this.rightOperand = rightOperand;

    this.calculateResult = function () {
        let result = 0;

        switch (this.operator){
            case "+":
                result = this.leftOperand + this.rightOperand;
                break;
            case "-":
                result = this.leftOperand - this.rightOperand;
                break;
            case "*":
                result = this.leftOperand * this.rightOperand;
                break;
            case "/":
                result = this.leftOperand / this.rightOperand;
                break;
            case "^":
                if (this.rightOperand == 0)
                {
                    result = 1;
                }
                else if(this.rightOperand > 0)
                {
                    result = this.leftOperand;
                    for(let i = 1; i < this.rightOperand; i++){
                        result *= this.leftOperand;
                    }
                }
                else
                {
                    result = this.leftOperand;
                    for(let i = 1; i < Math.abs(this.rightOperand); i++){
                        result *= this.leftOperand;
                    }
                    result = 1 / result;
                }
                break;
        }

        return result;
    }
}

module.exports = Calculator;