
export interface Transaction {

    id: number;
    type_id: string;
    date: string;
    product: string;
    price: number;
    seller: string;

    creator: number;
    affiliate: number;
    client: number;

}
